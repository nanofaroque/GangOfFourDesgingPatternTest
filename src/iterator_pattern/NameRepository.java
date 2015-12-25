package iterator_pattern;

public class NameRepository implements Container {

    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator{

		int index;
		@Override
		public boolean hasNext() {

	         if(index < names.length){
	            return true;
	         }
	         return false;
		}

		@Override
		public Object next() {
			 if(this.hasNext()){
		            return names[index++];
		         }
		         return null;
		}
		
	}

}
