public class Rock extends Piece{
    public Rock(){
        super();
    }
    boolean isValidMove(Position newPosition){
        if(!super.isValidMove(position)){
            return false;
        }
        if(newPosition.column == this.position.column || newPosition.row == this.position.row){
            return true;
        }
        else{
            return false;
        }
    }
}
