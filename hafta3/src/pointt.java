public class pointt {

    public static int objectCount = 0;

    private String name;
    private int id;

    public pointt() {
    objectCount++;
    id = objectCount;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int x){
        id =x;
    }
    public void setName(String y){

        name = y;
    }
}


