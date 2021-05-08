package pl.edu.pwsztar.chess.domain;

import lombok.*;
import pl.edu.pwsztar.chess.enums.FigureType;

@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
class FigureMove {
    private Point source;
    private Point destination;
    private FigureType type;
}
