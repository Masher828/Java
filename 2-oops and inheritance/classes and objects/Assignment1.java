

class Assignment1{
	public static void main(String[] arg){
		int width,height,depth,volume;
		width=Integer.parseInt(arg[0]);
		height=Integer.parseInt(arg[1]);
		depth=Integer.parseInt(arg[2]);
		Box obj = new Box(width, height, depth);
		volume=obj.cal_Volume();
		System.out.println(volume);
	}
}

 class Box{
	int width, height, depth;
	public Box(int width, int height, int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public int cal_Volume(){
		int volume= width*height*depth;
		return volume;
	}
}
		