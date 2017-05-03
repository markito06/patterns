package builder;

public class Pizza {
	
	private Integer tamanho;
	private Boolean queijo;
	private Boolean tomate;
	private Boolean bacon;
	
	public static class Builder {
			
		private final Integer tamanho;
		private Boolean queijo = Boolean.FALSE;
		private Boolean tomate = Boolean.FALSE;
		private Boolean bacon = Boolean.FALSE;
		
		public Builder(Integer tamanho) {
			this.tamanho = tamanho;
			
		}
		
		public Builder queijo(){
			this.queijo = Boolean.TRUE;
			return this;
		}
		
		public Builder tomate(){
			this.tomate = Boolean.TRUE;
			return this;
		}
		
		public Builder bacon(){
			this.bacon = Boolean.TRUE;
			return this;
		}
		
		public Pizza build(){
			return new Pizza(this);
		}
		
	}
			
	private Pizza (Builder builder){
		tamanho = builder.tamanho;
		queijo = builder.queijo;
		tomate = builder.tomate;
		bacon = builder.bacon;
	}
	
	
}
