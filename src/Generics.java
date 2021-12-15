
class Main<T> {
	
	T obj;
	Main(T obj){
		this.obj=obj;
	}
	public T getObject(){
		return this.obj;
	}

}
class Generics{
	public static void main(String[] args) {
		Main<Integer> iobj=new Main<Integer>(123);
		System.out.println(iobj.getObject());
		
		Main<String> sobj=new Main<String>("AK");
		System.out.println(sobj.getObject());
		
		
		
	}
}
