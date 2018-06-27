package glenwa.ly.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic("1", "Nalin", "The owner"), new Topic("2", "All", "The users")

			));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {

		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	public void addTopic(Topic topic) {
		topics.add(topic);

	}

	public void updateTopic(String id, Topic topic) {

		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
System.out.println("In : " + t.getId());
System.out.println("id : " + id);
			if (t.getId().equals(id)) {
				System.out.println("In if" + i );

				topics.set(i, topic);
				return;
			}
		}
	}

	public void updateTopic(String id) {

		topics.removeIf(t-> t.getId().equals(id));
	}

}
