package com.wang.java_stu.enum1;




public enum Color {
      RED("hong"),GREEN("lv"),BLUE("lan");
	private String name;
	private Color(String name){
		this.name=name();
	}

     public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Color getInStance(int i){
	switch(i){
	case 1:{
		return RED ;
	}
	case 2:{
		return GREEN ;
	}
	case 3:{
		return BLUE ;
	}default:{
		return null ;
	}
}

}

}
