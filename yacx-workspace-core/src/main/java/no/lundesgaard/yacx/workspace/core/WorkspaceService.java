package no.lundesgaard.yacx.workspace.core;

import static lombok.AccessLevel.PRIVATE;

import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = true, level = PRIVATE)
@AllArgsConstructor
public class WorkspaceService {
    WorkspaceRepository workspaceRepository;
    
    public Workspace save(Workspace workspace) {
        WorkspaceId id = workspace.getId();
        if (workspaceRepository.exists(id)) {
            workspaceRepository.update(workspace);
        } else {
            id = workspaceRepository.create(workspace);
        }
        return workspaceRepository.read(id);
    }
}
