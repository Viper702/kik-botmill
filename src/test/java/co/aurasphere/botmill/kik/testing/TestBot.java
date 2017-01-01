package co.aurasphere.botmill.kik.testing;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import co.aurasphere.botmill.kik.model.Chat;
import co.aurasphere.botmill.kik.model.FileMessage;
import co.aurasphere.botmill.kik.model.FriendPicker;
import co.aurasphere.botmill.kik.model.Keyboard;
import co.aurasphere.botmill.kik.model.KikApi;
import co.aurasphere.botmill.kik.model.KikBot;
import co.aurasphere.botmill.kik.model.Message;
import co.aurasphere.botmill.kik.model.Settings;

/**
 * The Class TestBot.
 */
public class TestBot extends KikBot {

	/** The bot. */
	public static KikApi bot;

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws Exception
	 *             the exception
	 */
	public static void main(String[] args) throws Exception {
		bot = KikApi.buildBot("heyjayreyes", "0427ae1f-0d2c-490d-8053-4f397b612161", (short) 8080, new TestBot());
		bot.setSettings(new Settings(false, false, false, false)); // manuallySendReadReceipts,
																	// receiveReadReceipts,
																	// receiveDeliveryReceipts,
																	// receiveIsTyping
		bot.init(false); // Should the init block?
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.thub.kik.botstack.KikBot#onTextReceived(com.thub.kik.botstack.
	 * Message)
	 */
	@Override
	public void onTextReceived(Message msg) {
		List<Object> objects = new ArrayList<Object>();
		objects.add("hi");
		objects.add("no");
		objects.add(new FriendPicker("Select 2-5 friends", 2, 5));

		Keyboard keyboard = new Keyboard(objects);

		msg.getChat().sendMessage(new Message("Hi there!", Message.Type.TEXT).setKeyboard(keyboard));

		Iterator<Map.Entry<String, Chat>> it = bot.getLatestChats().entrySet().iterator(); // bot.getLatestChats()
																							// //
																							// to
																							// users.
		while (it.hasNext()) // The code in this codeblock sends the text that
								// it received to everyone.
		{
			Map.Entry<String, Chat> pair = (Map.Entry<String, Chat>) it.next();
			pair.getValue().sendMessage(new Message(msg.getBody(), Message.Type.TEXT));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.thub.kik.botstack.KikBot#onFriendPickedReceived(com.thub.kik.botstack
	 * .Message)
	 */
	@Override
	public void onFriendPickedReceived(Message msg) {
		msg.getChat()
				.sendMessage(new Message(
						"You chose these friends: " + Arrays.stream(msg.getPicked()).collect(Collectors.joining(" ")),
						Message.Type.TEXT));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.thub.kik.botstack.KikBot#onImageReceived(com.thub.kik.botstack.
	 * Message)
	 */
	@Override
	public void onImageReceived(Message msg) {
		msg.getChat().sendMessage(new Message("You sent this image", Message.Type.TEXT),
				new Message(msg.getPictureUrl(), Message.Type.IMAGE));
		msg.getChat().sendMessage(new FileMessage(new File("images/test.png"), bot, Message.Type.IMAGE, 4)); // can
																												// be
																												// used
																												// to
																												// send
																												// images
																												// from
																												// a
																												// File,
																												// the
																												// last
																												// parameter
																												// is
																												// the
																												// type
																												// time.
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.thub.kik.botstack.KikBot#onVideoReceived(com.thub.kik.botstack.
	 * Message)
	 */
	@Override
	public void onVideoReceived(Message msg) {
		msg.getChat().sendMessage(new Message("You sent this video", Message.Type.TEXT),
				new Message(msg.getVideoUrl(), Message.Type.VIDEO));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.thub.kik.botstack.KikBot#onUrlReceived(com.thub.kik.botstack.Message)
	 */
	@Override
	public void onUrlReceived(Message msg) {
		msg.getChat().sendMessage(new Message("You sent this URL", Message.Type.TEXT),
				new Message(msg.getBody(), Message.Type.URL));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.thub.kik.botstack.KikBot#onStartChattingReceived(com.thub.kik.
	 * botstack.Message)
	 */
	@Override
	public void onStartChattingReceived(Message msg) {
		msg.getChat().sendMessage(new Message("Welcome!", Message.Type.TEXT));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.thub.kik.botstack.KikBot#onUserTypingReceived(com.thub.kik.botstack.
	 * Message)
	 */
	@Override
	public void onUserTypingReceived(Message msg) {
		System.out.println(msg.getFrom().getUsername() + " started typing.");
	}
}