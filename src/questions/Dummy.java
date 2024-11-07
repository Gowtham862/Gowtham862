package questions;

 class Dumm extends Exception
 {
	 private String msg;

	public Dumm(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	 
	
}
 class Dummy
 {
	 public static void main(String[] args) {
		if("ab".equals("ab")) {
			System.out.println("login sucess");
		}
		else {
			try {
				throw new Dumm("invalid");
			}
			catch(Dumm e){
				System.out.println(e.getMsg());
				
			}
		}
			}
 }
