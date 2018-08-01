package sef.module17.sample;
// Complete Code
import java.io.Serializable;

public class Product implements Serializable {
	
	private String description;
	private Double price;
	private String name;
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Name: "+name);
        buffer.append(" Description: " + description + ";");
        buffer.append("Price: " + price);
        return buffer.toString();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}
}
