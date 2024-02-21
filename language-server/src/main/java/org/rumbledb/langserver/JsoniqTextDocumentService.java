package org.rumbledb.langserver;

import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.services.TextDocumentService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class JsoniqTextDocumentService implements TextDocumentService {
    @Override
    public CompletableFuture<Either<List<CompletionItem>, CompletionList>> completion(
            CompletionParams completionParams) {
        // Provide completion item.
        return CompletableFuture.supplyAsync(() -> {
            List<CompletionItem> completionItems = new ArrayList<>();
            try {
                // Sample Completion item for sayHello
                CompletionItem completionItem = new CompletionItem();
                // Define the text to be inserted in to the file if the completion item is
                // selected.
                completionItem.setInsertText("sayHello() {\n    print(\"hello\")\n}");
                // Set the label that shows when the completion drop down appears in the Editor.
                completionItem.setLabel("sayHello()");
                // Set the completion kind. This is a snippet.
                // That means it replace character which trigger the completion and
                // replace it with what defined in inserted text.
                completionItem.setKind(CompletionItemKind.Snippet);
                // This will set the details for the snippet code which will help user to
                // understand what this completion item is.
                completionItem.setDetail("sayHello()\n this will say hello to the people");

                // Add the sample completion item to the list.
                completionItems.add(completionItem);
            } catch (Exception e) {
                // TODO: Handle the exception.
            }

            // Return the list of completion items.
            return Either.forLeft(completionItems);
        });
    }

    @Override
    public CompletableFuture<CompletionItem> resolveCompletionItem(CompletionItem completionItem) {
        return null;
    }

    @Override
    public CompletableFuture<Hover> hover(HoverParams hoverParams) {
        return null;
    }

    @Override
    public CompletableFuture<SignatureHelp> signatureHelp(SignatureHelpParams signatureHelpParams) {
        return null;
    }

    @Override
    public CompletableFuture<Either<List<? extends Location>, List<? extends LocationLink>>> definition(
            DefinitionParams definitionParams) {
        return null;
    }

    @Override
    public CompletableFuture<List<? extends Location>> references(ReferenceParams referenceParams) {
        return null;
    }

    @Override
    public CompletableFuture<List<? extends DocumentHighlight>> documentHighlight(
            DocumentHighlightParams documentHighlightParams) {
        // TODO: Parse the document here
        // https://microsoft.github.io/language-server-protocol/specifications/lsp/3.17/specification/#textDocument_semanticTokens
        return null;
    }

    @Override
    public CompletableFuture<List<Either<SymbolInformation, DocumentSymbol>>> documentSymbol(
            DocumentSymbolParams documentSymbolParams) {
        // TODO: Parse the document here
        // https://microsoft.github.io/language-server-protocol/specifications/lsp/3.17/specification/#textDocument_semanticTokens
        return null;
    }

    @Override
    public CompletableFuture<List<Either<Command, CodeAction>>> codeAction(CodeActionParams codeActionParams) {
        return null;
    }

    @Override
    public CompletableFuture<List<? extends CodeLens>> codeLens(CodeLensParams codeLensParams) {
        return null;
    }

    @Override
    public CompletableFuture<CodeLens> resolveCodeLens(CodeLens codeLens) {
        return null;
    }

    @Override
    public CompletableFuture<List<? extends TextEdit>> formatting(DocumentFormattingParams documentFormattingParams) {
        return null;
    }

    @Override
    public CompletableFuture<List<? extends TextEdit>> rangeFormatting(
            DocumentRangeFormattingParams documentRangeFormattingParams) {
        return null;
    }

    @Override
    public CompletableFuture<List<? extends TextEdit>> onTypeFormatting(
            DocumentOnTypeFormattingParams documentOnTypeFormattingParams) {
        return null;
    }

    @Override
    public CompletableFuture<WorkspaceEdit> rename(RenameParams renameParams) {
        return null;
    }

    @Override
    public void didOpen(DidOpenTextDocumentParams didOpenTextDocumentParams) {

    }

    @Override
    public void didChange(DidChangeTextDocumentParams didChangeTextDocumentParams) {

    }

    @Override
    public void didClose(DidCloseTextDocumentParams didCloseTextDocumentParams) {

    }

    @Override
    public void didSave(DidSaveTextDocumentParams didSaveTextDocumentParams) {

    }
}