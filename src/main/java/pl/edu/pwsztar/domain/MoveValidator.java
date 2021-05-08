package pl.edu.pwsztar.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.edu.pwsztar.domain.enums.FigureType;

class MoveValidator {
    private static final Logger LOGGER = LoggerFactory.getLogger(MoveValidator.class);

    public boolean isMoveValid(FigureMove figureMove) {

        if(figureMove.getType().equals(FigureType.BISHOP)){
            LOGGER.info("source {}",figureMove.getSource().toString());
            LOGGER.info("destination {}",figureMove.getDestination().toString());
            int sourceX = figureMove.getSource().getX();
            int sourceY = figureMove.getSource().getY();
            int destinationX = figureMove.getDestination().getX();
            int destinationY = figureMove.getDestination().getY();
            if (Math.abs(sourceX-destinationX) == Math.abs(sourceY - destinationY)) {
                return true;
            }
        }

        return false;
    }
}
