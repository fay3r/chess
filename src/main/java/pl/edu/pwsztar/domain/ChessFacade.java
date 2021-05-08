package pl.edu.pwsztar.domain;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.pwsztar.domain.dto.FigureMoveDto;
import static java.util.Objects.requireNonNull;

@Transactional
class ChessFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChessFacade.class);

    private final MoveValidator moveValidator;
    private final MoveConverter moveConverter;

    ChessFacade(MoveValidator moveValidator, MoveConverter moveConverter){
        this.moveValidator = moveValidator;
        this.moveConverter = moveConverter;
    }

    public boolean makeMove(FigureMoveDto figureMoveDto){
        requireNonNull(figureMoveDto);
        FigureMove figureMove = moveConverter.toFigureMove(figureMoveDto);
        if(moveValidator.isMoveValid(figureMove)){
            return true;
        } else {
            return false;
        }
    }


}