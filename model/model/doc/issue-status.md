[Issue](Issue.html) status, e.g. ``Open``, ``In Progress``, ``Done``. 
Status can be set at the issue level, or [note](Note.html) level. Is status is not set at the issue, the status of the last note is considered to be the status of the issue.

If issue status ``done`` attribute is set to ``true`` it means that the issue outcome has been achieved and:

* Issues which require this issue can be worked on.
* Releases and features which this issue is planned for and contributes to are considered to be available unless there other not yet done issues.

Note that an issue can be completed (remaining effort and cost are zero) but not done, e.g. it may be cancelled.