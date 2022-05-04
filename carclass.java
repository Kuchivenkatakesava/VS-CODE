public class carclass {
    String name;
    String model;
    int cost;
    String type;

    public void car (String name, String model,int cost, String type) {

        this.name = name;
        this.model = model;
        this.cost = cost;
        this.type = type;
    }
    
public String getName()
{
    return name;
}

public String getModel()
{
    return model;
}

public int getCost()
{
    return cost;
}

public String getType()
{
    return type;
}

public static void main(String[] args)
{

    car c = new car ("mahindra","XUV700",2100000,"Petrol");

    System.out.println("The company name is"+ c. getName());
    System.out.println("The model is"+ c. getModel());
    System.out.println("The cost is"+ c.getClass());
    System.out.println("The type is"+ c.getType());
   }
}

