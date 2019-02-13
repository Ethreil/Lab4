public class EquipmentTest {
	
	    
	    public void constructorTest() throws AssertException 
	    {
	    	Equipment equipment = new Equipment("Water Buckets,25,58.6,20.5,Water Buckets for animals to drink from");
	    	
	    	Assert.assertEquals("Water Buckets", equipment.getName());
	    	Assert.assertEquals(25, equipment.getCount());
	    	Assert.assertEquals(58.6, equipment.getTotalWeight());
	    	Assert.assertEquals(20.5, equipment.getTotalPrice());
	    	Assert.assertEquals("Water Buckets for animals to drink from", equipment.getDescription());
	    }
	
	
	
}