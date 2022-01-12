
public class Product {
	
	private int _id;
	private String _name;
	private String _description;
	private int _stockAmount;
	private int _price;
	private String _renk;
	private String _kod;
	
	//getter: deðeri okuma
	public int getId() {
		return _id;
	}
	
	//setter: deðer atama
	public void setId(int id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}
	
	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}
	
	public int getStockAmount() {
		return _stockAmount;
	}
	
	public void setStockAmount(int stockAmount) {
		_stockAmount = stockAmount;
	}
	
	public int getPrice() {
		return _price;
	}
	
	public void setPrice(int price) {
		_price = price;
	}
	
	public String getRenk() {
		return _renk;
	}

	public void setRenk(String renk) {
		_renk = renk;
	}
	
	public String getKod() {
		return _kod.substring(0,1) +_id;
	}

}
