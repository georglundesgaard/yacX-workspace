package no.lundesgaard.yacx.workspace.core;

import static no.lundesgaard.yacx.workspace.core.WorkspaceType.GIT;

import java.net.URL;

import lombok.Getter;
import lombok.NonNull;
import lombok.Value;

@Value
@Getter()
public final class GitWorkspace implements Workspace {
    @NonNull WorkspaceId id;
    @NonNull URL url;
    @NonNull String branch;

    @Override
    public WorkspaceType getType() {
        return GIT;
    }
}
