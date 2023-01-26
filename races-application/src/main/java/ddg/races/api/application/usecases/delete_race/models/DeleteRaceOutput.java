package ddg.races.api.application.usecases.delete_race.models;

public class DeleteRaceOutput {
    public boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    private boolean deleted;

    public DeleteRaceOutput(boolean deleted) {
        this.deleted = deleted;
    }
}
