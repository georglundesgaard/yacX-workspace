package no.lundesgaard.yacx.workspace.core;

public interface WorkspaceRepository {
    WorkspaceId create(Workspace workspace);
    
    Workspace read(WorkspaceId id);
    
    void update(Workspace workspace);
    
    void delete(WorkspaceId id);

    boolean exists(WorkspaceId id);
}
