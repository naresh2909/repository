package firstpro.java;

 class Encap {
		private int num;
		public int getnum(){
		return num;
		}
		public void setnum(int num){
		this.num=num;
		}
		public static void main(String[] args){
		Encap p=new Encap();
		p.setnum(4);
		System.out.println(p.getnum());
		}
		}



