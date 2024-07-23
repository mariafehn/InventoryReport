package osu.cse2123;

/**
 * A simple class for holding product information.
 *
 * @author Maria Caterina Fehn
 * @version 6 March 2023
 */

public class Product {

	static int quantity;
	String name;
	String type;
	double price;
	int invCode;
	int userRating;
    // Private member variables go here - you will need to add them yourself.

    /**
 	 * Product constructor - creates a default product with no name or type or
     * inventory code, no ratings, and a price and quantity of 0.
     * @postcond a product object with no name or type or inventory code, no ratings 
     *                 and a price and quantity of 0
     */
    public Product() {
    	//TODO: Your code here.
    }

    /**
     * sets the name of the product object
     *
     * @param name new name for the product
     * @postcond product name is now name
     */
    public void setName(String name) {
    	//TODO: Your code here.
    }

    /**
     * returns the name of the product
     *
     * @return the name of the product
     */
    public String getName() {
		//TODO: Your code here.
    	
		//TODO: Replace the line below with your own code
        return "";
    }

    /**
     * sets the type of the product
     *
     * @param type the type of the product
     * @postcond sets the type of the product to type
     */
    public void setType(String type) {
    	//TODO: Your code here.
    }

    /**
     * returns the type of the product
     *
     * @return - the product type
     */
    public String getType() {
		//TODO: Your code here.
    	
		//TODO: Replace the line below with your own code
        return "";
    }

    /**
     * sets the price of the product in cents. A $10 product will have a price
     * of 1000.
     *
     * @param price the price of the product
     * @postcond price of the product set to price
     */
    public void setPrice(int price) {
    	//TODO: Your code here.
    }

    /**
     * returns the price of the product in cents.
     *
     * @return the price of the product in cents
     */
    public int getPrice() {
		//TODO: Your code here.
    	
		//TODO: Replace the line below with your own code
        return 0;
    }

    /**
     * sets the count of this product in our inventory.
     *
     * @param quantity the number of this product in inventory
     * @postcond quantity of product set to quantity
     */
    public void setQuantity(int quantity) {
    	//TODO: Your code here.
    }

    /**
     * returns the count of this product in our inventory
     *
     * @return the number of this product in inventory
     */
    public int getQuantity() {
		//TODO: Your code here.
    	
		//TODO: Replace the line below with your own code
        return 0;
    }

    /**
     * sets the inventory code for this product
     *
     * @param code the new inventory code for the product
     * @postcond the inventory code for the product set to code
     */
    public void setInventoryCode(String code) {
		//TODO: Your code here.
    	
		//TODO: Replace the line below with your own code
    }

    /**
     * returns the inventory code for this product
     *
     * @return the inventory code of the product
     */
    public String getInventoryCode() {
		//TODO: Your code here.
    	
		//TODO: Replace the line below with your own code
        return "";
    }

    /**
     * NOTE: Each individual rating is stored with the product, so you need to
     * maintain a list of user ratings. This method should append a new rating
     * to the end of that list
     *
     * @param rating the new rating to add to this product
     * @postcond the list of ratings for this product includes rating
     */
    public void addUserRating(int rating) {
		//TODO: Your code here.
    	
		//TODO: Replace the line below with your own code
    }

    /**
     * NOTE: See note on addUserRating above. This method should be written to
     * allow you to access an individual value from the list of user ratings
     *
     * @param index the index of the rating we want to see
     * @precond index < number of ratings for this product
     * @return the rating indexed by the value index
     */
    public int getUserRating(int index) {
		//TODO: Your code here.
    	
		//TODO: Replace the line below with your own code
        return 0;
    }

    /**
     * NOTE: See note on addUserRating above. This method should be written to
     * return the total number of ratings this product has associated with it
     *
     * @return the number of ratings associated with this product
     */
    public int getUserRatingCount() {
		//TODO: Your code here.
    	
		//TODO: Replace the line below with your own code
        return 0;
    }

    /**
     * NOTE: see note on addUserRating above. This method should be written to
     * compute the average user rating on demand from a stored list of ratings.
     *
     * @return the average rating for this product as a whole integer value (use
     *         integer math)
     */
    public int getAvgUserRating() {
		//TODO: Your code here.
    	
		//TODO: Replace the line below with your own code
        return 0;
    }
}
