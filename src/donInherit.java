public class donInherit extends animalinherit {
    private String name;
    public donInherit(String name) {
        this.name = name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void bark(){

        System.out.println(
                name+"汪汪汪"
        );
    }
}
