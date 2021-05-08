package pl.edu.pwsztar.domain;

import lombok.*;
import pl.edu.pwsztar.domain.enums.FigureType;

@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
class FigureMove {
    private Point source;
    private Point destination;
    private FigureType type;
}
