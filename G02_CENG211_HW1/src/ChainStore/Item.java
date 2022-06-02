package ChainStore;

public class Item {
	private String ID;
	private String Name;
	private String Category;
	
	
	public Item(String ID, String Name, String Category) {
		this.ID = ID;
		this.Name = Name;
		this.Category = Category;
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}


}
