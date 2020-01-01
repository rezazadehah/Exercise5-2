public class CarsFactory {

    public Cars getCar(String name){

        if (name.equals("benz"))
        {
            return new Benz();
        }else if(name.equals("bmw"))
        {
            return new BMW();
        }
        else {
            return null;
        }

    }

}
