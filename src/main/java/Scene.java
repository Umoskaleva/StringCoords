import java.util.List;

public class Scene {
    private List<Shape> objects;

    public List<Shape> getObjects(){
        return objects;
    }

    public void setObjects(List<Shape> objects){
        this.objects = objects;
    }

    public void drow(){
        for(var o : getObjects())
            o.draw();
    }


}
