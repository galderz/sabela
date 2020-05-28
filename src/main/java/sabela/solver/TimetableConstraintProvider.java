package sabela.solver;

import org.optaplanner.core.api.score.stream.Constraint;
import org.optaplanner.core.api.score.stream.ConstraintFactory;
import org.optaplanner.core.api.score.stream.ConstraintProvider;

public class TimetableConstraintProvider implements ConstraintProvider
{
    @Override
    public Constraint[] defineConstraints(ConstraintFactory constraintFactory)
    {
        return new Constraint[0];  // TODO: Customise this generated block
    }
}
