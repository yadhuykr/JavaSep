package oops.interf.features;

public abstract class Camera {
    public abstract void takePhoto();
    public abstract void takeVIdeo();
    public abstract void selfie();
    public abstract void potrait();

    public void backCamera(){
        System.out.println("Can take photo using back Camera");
    }
}
