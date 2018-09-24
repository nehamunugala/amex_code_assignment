package amex.ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CustomerDAO {
	 private static final Map<String, Customer> custMap = new HashMap<String, Customer>();
	 
	    static {
	        initcusts();
	    }
	 
	    private static void initcusts() {
	        Customer cust1 = new Customer("Georgia", "Sherla", "3452456787", "sherla123@gmail.com");
	        Customer cust2 = new Customer("New Jersey", "Bob", "7852456787", "bob123@gmail.com");
	        Customer cust3 = new Customer("New York", "Jim", "9952456787", "jim123@gmail.com");
	 
	        custMap.put(cust1.getEmail(), cust1);
	        custMap.put(cust2.getEmail(), cust2);
	        custMap.put(cust3.getEmail(), cust3);
	    }
	 
	    public static Customer getCustomer(String custEmail) {
	        return custMap.get(custEmail);
	    }
	 
	    public static Customer addCustomer(Customer cust) {
	        custMap.put(cust.getEmail(), cust);
	        return cust;
	    }
	 
	    public static Customer updateCustomer(Customer cust) {
	        custMap.put(cust.getEmail(), cust);
	        return cust;
	    }
	 
	    public static void deleteCustomer(String custEmail) {
	        custMap.remove(custEmail);
	    }
	 
	    public static List<Customer> getAllCustomers() {
	        Collection<Customer> c = custMap.values();
	        List<Customer> list = new ArrayList<Customer>();
	        list.addAll(c);
	        return list;
	    }
	     
	    List<Customer> list;
	 
}
