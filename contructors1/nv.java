public class nv {

	String name; //those are atribute include variable and there's types
	int age;
	double weight;
	
	nv(String name,int age,double weight){ //day la 1 contructor(hàm khởi tạo)
		//contructor co ten giong voi class chua no
		//Default Constructor là hàm khởi tạo không có tham số
		//Parameterized Constructor: la contructor co tham so
		//khac biet voi method ve access modifier(pham vi luu tru du lieu)
		//(public,private,defaul,..)
		this.name = name;//this dung de replace object name
		this.age = age;//other wise hieu.weight = weight and hieu1.weight
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name+" is eating");
	}
	void drink() {
		System.out.println(this.name+" is drinking");
	}
}