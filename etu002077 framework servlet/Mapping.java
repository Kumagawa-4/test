import java.util.HashMap;

public class Mapping {
    private String className;
    private String methodName;
    private HashMap<String, Mapping> mappingUrls;
    
    public Mapping(String className, String methodName) {
        this.className = className;
        this.methodName = methodName;
        this.mappingUrls = new HashMap<String, Mapping>();
    }
    
    public String getClassName() {
        return this.className;
    }
    
    public String getMethodName() {
        return this.methodName;
    }
    
    public void setMappingUrls(String url, Mapping mapping) {
        this.mappingUrls.put(url, mapping);
    }
    
    public HashMap<String, Mapping> getMappingUrls() {
        return this.mappingUrls;
    }
    
    public String method() {
        return "This is the " + this.methodName + " method in the " + this.className + " class.";
    }
}
