package healthyHeaven;

import java.util.ArrayList;
import java.util.List;

public class Salad {
    private String name;
    private List<Vegetable> products;

    public Salad(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getTotalCalories(){
        int sum = 0;
        for (Vegetable product : products) {
            sum+= product.getCalories();
        }
        return sum;
    }

    public int getProductCount(){
        return this.products.size();
    }

    public void add(Vegetable product){
        this.products.add(product);
    }



    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("* Salad ").append(this.name).append(" is ").append(getTotalCalories()).append(" calories and have ")
                .append(getProductCount()).append(" products:").append(System.lineSeparator());
        for (Vegetable product : products) {
            sb.append(product.toString()).append(System.lineSeparator());
        }


        return sb.toString().trim();
    }
}

