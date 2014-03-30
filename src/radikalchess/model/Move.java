package radikalchess.model;

public class Move {

    private final Position origin;
    private final Position destination;

    public Move(Position origin, Position destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public Position getOrigin() {
        return origin;
    }

    public Position getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return "Moving piece from " + origin.toString() + " to " + destination.toString();
    }


}