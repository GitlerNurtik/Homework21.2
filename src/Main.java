public class Main {
    public static void main(String[] args) {
        try(Car car = new Car()){
            car.Drive();
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}