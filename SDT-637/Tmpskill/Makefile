.PHONY: all

all:
	./gradlew shadowJar
	echo "built skill in ./build/libs"
	# tmux new-window -n Furhat-Skill "java -cp ./build/libs/Furhead2-all.skill furhatos.skills.Skill"
	tmux split-window "java -cp ./build/libs/Tmpskill-all.skill furhatos.skills.Skill"
