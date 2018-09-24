package amex.ws;

import java.util.List;
 
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
public class RESTAPITest {
	
	@Path("/customers")
	public class CustomerAPI {
	 
	    // URI:
	    // /contextPath/servletPath/customers
	    @GET
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public List<Customer> getCustomerDetails() {
	        List<Customer> listOfCustomers = CustomerDAO.getAllCustomers();
	        return listOfCustomers;
	    }
	 
	    // URI:
	    // /contextPath/servletPath/customers/{custEmail}
	    @GET
	    @Path("/{custEmail}")
	    @Produces({ MediaType.APPLICATION_JSON})
	    public Customer getCustomerDetails(@PathParam("custEmail") String custEmail) {
	        return CustomerDAO.getCustomer(custEmail);
	    }
	 
	    // URI:
	    // /contextPath/servletPath/customers
	    @POST
	    @Produces({ MediaType.APPLICATION_JSON})
	    public Customer addCustomer(Customer cust) {
	        return CustomerDAO.addCustomer(cust);
	    }
	 
	    // URI:
	    // /contextPath/servletPath/Customers
	    @PUT
	    @Produces({ MediaType.APPLICATION_JSON })
	    public Customer updateCustomer(Customer cust) {
	        return CustomerDAO.updateCustomer(cust);
	    }
	 
	    @DELETE
	    @Path("/{custEmail}")
	    @Produces({ MediaType.APPLICATION_JSON})
	    public void deleteCustomer(@PathParam("custEmail") String custEmail) {
	        CustomerDAO.deleteCustomer(custEmail);
	    }
	 
	}

}
