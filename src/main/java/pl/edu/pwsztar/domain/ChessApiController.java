package pl.edu.pwsztar.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.pwsztar.domain.dto.FigureMoveDto;

@Controller
@RequestMapping(value="/api")
public class ChessApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChessApiController.class);

    private final ChessFacade chessFacade;

    ChessApiController(ChessFacade chessFacade){
        this.chessFacade = chessFacade;
    }


    @CrossOrigin
    @PostMapping(value = "/chess/is-correct-move")
    public ResponseEntity<Boolean> isCorrectMove(@RequestBody FigureMoveDto figureMoveDto) {
        LOGGER.info("*** move details : {}", figureMoveDto);

        // TODO: true = ruch dozwolony (figura moze przemiescic sie z punktu source do punktu destination)
        // TODO: false = ruch zabroniony (figura nie moze przemiescic sie z punktu source do punktu destination)
        return ResponseEntity.ok(chessFacade.makeMove(figureMoveDto));     // TODO: teraz figura moze przemieszczac sie do dowolnego pola
    }
}
