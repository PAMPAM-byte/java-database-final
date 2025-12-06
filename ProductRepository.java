package com.project.code.Repo;


public interface ProductRepository {
// 1. Add the repository interface:
//    - Extend JpaRepository<Product, Long> to inherit basic CRUD functionality.
//    - This allows the repository to perform operations like save, delete, update, and find without having to implement these methods manually.

// Example: public interface ProductRepository extends JpaRepository<Product, Long> {}

// 2. Add custom query methods:
//    - **findAll**:
//      - This method will retrieve all products.
//      - Return type: List<Product>

// Example: public List<Product> findAll();

//    - **findByCategory**:
//      - This method will retrieve products by their category.
//      - Return type: List<Product>
//      - Parameter: String category

// Example: public List<Product> findByCategory(String category);

//    - **findByPriceBetween**:
//      - This method will retrieve products within a price range.
//      - Return type: List<Product>
//      - Parameters: Double minPrice, Double maxPrice

// Example: public List<Product> findByPriceBetween(Double minPrice, Double maxPrice);

//    - **findBySku**:
//      - This method will retrieve a product by its SKU.
//      - Return type: Product
//      - Parameter: String sku

// Example: public Product findBySku(String sku);

//    - **findByName**:
//      - This method will retrieve a product by its name.
//      - Return type: Product
//      - Parameter: String name

// Example: public Product findById(String Id);

//    - **findById**:
//      - This method will retrieve a product by its id.
//      - Return type: Product
//      - Parameter: Long id

// Example: public Product findByName(String name);

//    - **findByNameLike**:
//      - This method will retrieve products by a name pattern for a specific store.
//      - Return type: List<Product>
//      - Parameters: Long storeId, String pname
//      - Use @Query annotation to write a custom query.

// Example: public Product findByNameAndCategory(String nameandcategory);

//    - **findByNameAndCategory**:
//      - This method will retrieve products by name and category pattern for a specific store.
//      - Return type: List<Product>
//      - Parameters: Long storeId, String pname, String category
//      - Use @Query annotation and write the following query.
           
// Example: public Product findByCategoryAndStoreId(String CategoryAndStoreId);

//    - **findByCategoryAndStoreId**:
//      - This method will retrieve products by category pattern for a specific store.
//      - Return type: List<Product>
//      - Parameters: Long storeId, String category
//      - Use @Query annotation and write the following query @Query("SELECT i.product FROM Inventory i WHERE i.store.id = :storeId AND i.product.category = :category") to filter by both category and storeId.
           
// Example: public Product findProductBySubName(String ProductBySubName);

//    - **findProductBySubName**:
//      - This method will retrieve products by a name pattern (ignoring case).
//      - Return type: List<Product>
//      - Parameters: String pname
//      - Use @Query annotation and write the following query @Query("SELECT i FROM Product i WHERE LOWER(i.name) LIKE LOWER(CONCAT('%', :pname, '%'))") for partial matching in name.

// Example: public Product findProductsByStoreId(String ProductsByStoreId);

//    - **findProductsByStoreId**:
//      - This method will retrieve all products for a specific store.
//      - Return type: List<Product>
//      - Parameters: Long storeId
//      - Use @Query annotation and write the following query @Query("SELECT i.product FROM Inventory i WHERE i.store.id = :storeId") to join Inventory and filter by storeId.

// Example: public Product findProductByCategory(String ProductsByCategory);

//    - **findProductsByCategory**:
//      - This method will retrieve products by category for a specific store.
//      - Return type: List<Product>
//      - Parameters: String category, Long storeId
//      - Use @Query annotation and write the following query @Query("SELECT i.product FROM Inventory i WHERE i.product.category = :category and i.store.id = :storeId") and filter by storeId. to filter by category and storeId.

// Example: public Product findProductBySubNameAndCategoryy(String ProductsBySubNameAndCategory);
//    - **findProductsBySubNameAndCategory**:
//      - This method will retrieve products by a name pattern and category.
//      - Return type: List<Product>
//      - Parameters: String pname, String category
//      - Use @Query annotation and write the following query @Query("SELECT i FROM Product i WHERE LOWER(i.name) LIKE LOWER(CONCAT('%', :pname, '%')) AND i.category = :category") to match both name and category criteria.

}
