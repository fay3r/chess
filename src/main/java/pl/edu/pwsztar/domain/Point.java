package pl.edu.pwsztar.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder(toBuilder = true)
@AllArgsConstructor
@Getter
@ToString
public class Point {
    private Integer x,y;
}
