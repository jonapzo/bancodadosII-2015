DROP TABLE items IF EXISTS;
DROP TABLE invoices IF EXISTS;
DROP TABLE products IF EXISTS;
DROP TABLE customers IF EXISTS;

CREATE TABLE customers(
	id INTEGER PRIMARY KEY, 
	first_name VARCHAR(20), 
	last_name VARCHAR(30), 
	street VARCHAR(50), 
	city VARCHAR(25)
);

CREATE TABLE products(
	id INTEGER PRIMARY KEY, 
	name VARCHAR(30), 
	price DECIMAL
);

CREATE TABLE invoices(
	id INTEGER PRIMARY KEY, 
	customer_id INTEGER, 
	total DECIMAL, 
	FOREIGN KEY (customer_id) REFERENCES customers(id) ON DELETE CASCADE
);

CREATE TABLE items(
	invoice_id INTEGER, 
	item_id INTEGER, 
	product_id INTEGER, 
	quantity INTEGER, 
	cost DECIMAL, 
	PRIMARY KEY(invoice_id, item_id), 
	FOREIGN KEY (invoice_id) REFERENCES invoices(id) ON DELETE CASCADE, 
	FOREIGN KEY (product_id) REFERENCES products(id) ON DELETE CASCADE
);