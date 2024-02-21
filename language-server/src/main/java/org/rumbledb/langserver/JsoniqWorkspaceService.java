package org.rumbledb.langserver;

import org.eclipse.lsp4j.DidChangeConfigurationParams;
import org.eclipse.lsp4j.DidChangeWatchedFilesParams;
import org.eclipse.lsp4j.SymbolInformation;
import org.eclipse.lsp4j.WorkspaceSymbolParams;
import org.eclipse.lsp4j.services.WorkspaceService;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.WorkspaceSymbol;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class JsoniqWorkspaceService implements WorkspaceService {
    @Override
    public CompletableFuture<Either<List<? extends SymbolInformation>, List<? extends WorkspaceSymbol>>> symbol(
            WorkspaceSymbolParams workspaceSymbolParams) {
        return null;
    }

    @Override
    public void didChangeConfiguration(DidChangeConfigurationParams didChangeConfigurationParams) {

    }

    @Override
    public void didChangeWatchedFiles(DidChangeWatchedFilesParams didChangeWatchedFilesParams) {

    }
}