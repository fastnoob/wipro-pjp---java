import java.util.*;

class Methods {
    private HashMap<String,String> M1;
    public Methods() {
        M1=new HashMap<String, String>();
    }
    public HashMap<String, String> saveCountryCapital(String countryName, String capital){
        M1.put(countryName,capital);
        return M1;
    }
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }
    public String getCountry(String capitalName) {
        Set<Map.Entry<String,String>> s = M1.entrySet();
        Iterator<Map.Entry<String,String>> i = s.iterator();
        while(i.hasNext()){
            Map.Entry<String,String> m = i.next();
            if(m.getValue().equals(capitalName)){
                return m.getKey();
            }
        }
        return null;
    }

    public HashMap<String,String> changeKeyVal() {
        HashMap<String,String> M2 = new HashMap<String,String>();
        Set<Map.Entry<String,String>> s = M1.entrySet();
        Iterator<Map.Entry<String,String>> i = s.iterator();
        while(i.hasNext()){
            Map.Entry<String,String> m = i.next();
            M2.put(m.getValue(),m.getKey());
        }
        return M2;
    }
    public ArrayList<String> convert2ArrayList() {
        ArrayList<String> list=new ArrayList<>();
        Set<Map.Entry<String,String>> s=M1.entrySet();
        Iterator<Map.Entry<String,String>> i=s.iterator();
        while(i.hasNext()){
            Map.Entry<String,String> m = i.next();
            list.add(m.getKey());
        }
        return list;
    }
}
