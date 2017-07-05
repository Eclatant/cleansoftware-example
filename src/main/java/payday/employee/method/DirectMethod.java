package payday.employee.method;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author myeongju.jung
 */
@Entity
@DiscriminatorValue("D")
@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class DirectMethod extends AbstractPaymentMethod {
    @NonNull
    private String bank;
    @NonNull
    private String account;
}