package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_EXPIRED_RECORD;

import seedu.address.model.Model;

/**
 * Lists all history in the address book to the user.
 */
public class ListExpiredRecordCommand extends Command {

    public static final String COMMAND_WORD = "list";

    public static final String MESSAGE_SUCCESS = "Listed all expired records";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredExpiredRecordList(PREDICATE_SHOW_ALL_EXPIRED_RECORD);
        System.out.println(model.getExpiredRecordBook().toString());

        return new CommandResult(MESSAGE_SUCCESS, false, false, false, false, false, true, false, false);

    }
}