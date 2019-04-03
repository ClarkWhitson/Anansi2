Anansi README

Intro
This project tasked me with creating an app relating to something I’m passionate about. The night I received it, I determined that the best way to begin might be to simply sit down and make a list of everything I feel passionate about. Once I had this list in place, I set about adding descriptions of various app ideas in each category. It took surprisingly little time to figure out which one I wanted to go with. To put my idea into some context, I’d like to first provide a little background information about my background, which greatly informed my decision.


Background
As far back as I can remember, I’ve always been fascinated by storytelling. When my parents would read me bedtime stories as a small child, I remember desperately wanting to learn how to read them myself, and to tell my own stories. But I also remember intensely frustrated by the shapes of words and sentences that made no sense to me at the time. Despite this desire, the ability to read actually came very hard for me initially. I wasn’t really able to pick it up until about second grade, well behind most of my peers. I still have very vivid and sometimes painful memories of this process.

Halfway through my first grade year, my mother moved us to a new part of Tennessee with a much higher rated school system than the one I’d been attending up to that point. My new school took a much more active approach with teaching us to read, focusing on daily phonics exercises that slowly started to help me make sense of the words I was reading. I can’t remember a particular moment when it clicked with me, because the process was so gradual, but once I finally got my mind around the basics, I found myself consistently reading and writing on a level that far surpassed nearly all of my classmates -- a trend which continued up through high school and college, with me getting a nearly perfect score on the English section of the ACT, and eventually deciding to major in English, with a focus on creative writing.

I mention all of the above as a way of illustrating how my experience with learning to program as an adult has largely mirrored those early childhood experiences with learning to write -- frustrations, triumphs and all. I’ve had to learn things slowly, and in small chunks, gradually building knowledge over a long period of time. So, when tasked with creating an app about something I was passionate about, storytelling seemed like a very obvious fit. Stories, much like Android apps, contain architectural patterns that can be broken down into smaller chunks that must be skillfully woven together to create a cohesive whole. And like Android apps, stories can often become convoluted and spiral out of control if one loses track of those moving parts. My thinking was that the act of developing an app like this would be the perfect way to tie my passions for storytelling and programming together in a way that felt appropriately poetic to me.



The App
My idea was essentially to create a way to help writers keep track of the pieces of their stories, and to assist them with assembling them in a logica, cohesive way. In a way, my final vision for the app would place it in a role not unlike the one Android Studio plays in helping developers construct their apps. Essentially, the final app would contain various activities responsible for keeping track of various story elements such as characters, plot points, and so on. The app would take all this information and create a visualization of the story for the user, which could then be manipulated and edited at will. I realized that this visualization could come to resemble a spider web, and naming it after eponymous spider trickster so often associated with the concept of storytelling seemed like the perfect choice.

I realized early on that the majority of this eventual functionality I envisioned would be well out of the scope of what could be accomplished by myself in a week, but I intend to continue building on what I have here until it someday lines up with that vision. So for this project, I aimed to focus on developing just one of those segments, the one representing a story’s characters.

My initial goal for this project  was to essentially create an app that allowed the user to create and manage a list of characters that would appear in their story. This was the first time I’d ever attempted to build my own app from scratch, as well as the first time I had ever been directly exposed to data binding or attempted to leverage MVVM architecture. There were many stumbling blocks along the way, and I struggled to implement many of my ideas in the time allotted. Still, I think I’ve managed to lay down the groundwork for what could someday become a downright nifty little app someday.


Components

Activities
In its present state, the app contains three main activities, though I was really only able to implement two of them in the time allotted. These activities include CharacterListActivity, CharacterDetailActivity, and CharacterPagerActivity.

CharacterListActivity is responsible for displaying a list of characters, each mapped to a button, all contained within a RecyclerView (using a GridLayoutManager). It also includes a menu icon that would allow the user to add a new character to the list. I ran out of time before I could implement any functionality into this icon though. In its current state, the app simply displays a list of 50 generated characters.

CharacterDetailActivity is responsible for displaying information about a character once the user has clicked on it in the listView. Currently, it contains a TextView to display the character’s name, and an EditText field to enter that name. It also contains a TextView with the string “Info”. My end goal will be to eventually fill this view out with various character attributes, such as their appearance, motivations, relationships to other characters, and their involvement in associated plot points. For now though, it simply has a TextView with the string “Info”, and a button that will eventually be able to return the user to the CharacterListActivity.

CharacterPagerActivity is the least fleshed out of my activities, I wasn’t able to implement it successfully, but the end goal is for it to provide a means for the user to swipe left and right to move between the different characters on the list.


Service
While I didn’t end up having time to implement it, I have created a Service called AnansiService that will eventually be responsible for communicating with a database that would take care of the app’s need for long term storage.

Architecture
As I mentioned above, this app was my first time working with data binding and the MVVM pattern. I had to learn about it as I went along, which was both challenging and rewarding.

The  app consists of three main Activities, and Service described above.

CharacterListActivity and CharacterDetailActivity host correspondingly named fragments to handle the responsibility of displaying their Views.

There are also two view models, one for the individual list items in CharacterListActivity and another for CharacterDetailActivity as a whole. These classes are responsible for deciding how the information in each view should be displayed.

The model layer consists of a class called Actor, currently responsible for keeping track of the names of each individual character, as well as their associated UUIDs. Another class, ActorManager, is responsible for storing the list of those characters, which is how the RecyclerView gets its information.


**NOTE ON SCREENSHOTS**
As requested, I've included screenshots of both my Views. I've uploaded both of them as PNGs in the directory labeled ViewScreenshots. (As a side note, at this time, I didn't have access to a computer with enough RAM to run a virtual machine, so both screenshots were simply taken from my physical device while running the app)