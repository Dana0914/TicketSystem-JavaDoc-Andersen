package andersen.lesson.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import tickettype.TicketType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;


@Getter
@AllArgsConstructor
public class BusTicket {
    private TicketType ticketType;
    private LocalDate date;
    private BigDecimal price;
    private String id;


    @Override
    public String toString() {
        return "BusTicket{" +
                "ticketType=" + ticketType +
                ", date=" + date +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusTicket busTicket = (BusTicket) o;
        return ticketType == busTicket.ticketType && Objects.equals(date, busTicket.date) && Objects.equals(price, busTicket.price) && Objects.equals(id, busTicket.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketType, date, price, id);
    }
}
