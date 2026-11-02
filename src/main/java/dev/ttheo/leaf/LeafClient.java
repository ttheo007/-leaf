package dev.ttheo.leaf;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.ClientCommands;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

public final class LeafClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) ->
            dispatcher.register(ClientCommands.literal("leaf").executes(context -> {
                Minecraft client = Minecraft.getInstance();

                if (client.getConnection() != null) {
                    // Use Minecraft's own world-disconnect flow so the client
                    // returns to the correct menu and cleans up the session.
                    client.disconnectFromWorld(Component.literal("Disconnected using /leaf"));
                } else {
                    context.getSource().sendFeedback(
                        Component.literal("You are not connected to a world or server.")
                    );
                }

                return 1;
            }))
        );
    }
}
