import java.util.*;
class MapUsingHash{

    //internally it would be entity of array made
    private Entity[] entities;
     
    public MapUsingHash(){
        entities= new Entity[100];
    }

    public void put(String key, String val){
        int hash=Math.abs(key.hashCode()% entities.length);
        entities[hash]=new Entity(key,val);   //overriding
    }

    public String get(String key){
        int hash=Math.abs(key.hashCode()% entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            return entities[hash].val;
        }
        return null;
    }

    public void remove(String key){
        int hash=Math.abs(key.hashCode()% entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            entities[hash]=null;
        }
    }

    private class Entity{
        String key;
        String val;

        public Entity(String key, String val){
            this.key=key;
            this.val=val;
        }
    }


    public static void main(String [] args){
        MapUsingHash map =new MapUsingHash();

        map.put("Mango","Yellow");
        map.put("Apple","Red");
        map.put("Litchi","Pink");

        System.out.println(map.get("Apple"));
    }
}