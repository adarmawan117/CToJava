package ctojava;

import java.util.ArrayList;

public class HeaderData {
    
    private String fileName;
    private String className;
    private ArrayList<String> globalVariabel;
    
    public HeaderData() {
        fileName = "";
        className = "";
        globalVariabel = new ArrayList<>();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ArrayList<String> getGlobalVariabelAsArrayList() {
        return globalVariabel;
    }

    public String[] getGlobalVariabelAsArray() {
        int countList = globalVariabel.size();
        String[] hasil = new String[countList];
        
        for(int i = 0; i < countList; i++) {
            hasil[i] = globalVariabel.get(i);
        }
        
        return hasil;
    }
    
    public void setGlobalVariabel(ArrayList<String> globalVariabel) {
        this.globalVariabel = globalVariabel;
    }
    
    public void addGlobalVariabel(String data) {
        this.globalVariabel.add(data);
    }
    
    public int countGlobalVariabel() {
        return this.globalVariabel.size();
    }
    
    public void reset() {
        this.globalVariabel.clear();
    }
}
