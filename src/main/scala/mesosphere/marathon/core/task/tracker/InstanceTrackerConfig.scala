package mesosphere.marathon
package core.task.tracker

import org.rogach.scallop.ScallopConf

trait InstanceTrackerConfig extends ScallopConf {

  lazy val internalTaskTrackerRequestTimeout = opt[Int](
    "task_tracker_request_timeout",
    descr = "INTERNAL TUNING PARAMETER: Timeout (in ms) for requests to the taskTracker.",
    hidden = true,
    default = Some(10000))

  lazy val internalTaskUpdateRequestTimeout = opt[Int](
    "task_update_request_timeout",
    descr = "INTERNAL TUNING PARAMETER: Timeout (in ms) for task update requests.",
    hidden = true,
    default = Some(10000))

  lazy val internalInstanceTrackerNumParallelUpdates = opt[Int](
    "instance_tracker_num_parallel_updates",
    descr = "INTERNAL TUNING PARAMETER: Number of instance updates handled in parallel by the Instance Tracker.",
    hidden = true,
    default = Some(16))

  lazy val internalInstanceTrackerNumParallelLoads = opt[Int](
    "instance_tracker_num_parallel_loads",
    descr = "INTERNAL TUNING PARAMETER: Number of instances loaded in parallel by the Instances Loader after startup.",
    hidden = true,
    default = Some(16))

  lazy val internalInstanceTrackerUpdateQueueSize = opt[Int](
    "instance_tracker_update_queue_size",
    descr = "INTERNAL TUNING PARAMETER: Instance Tracker overall instance update queue size",
    hidden = true,
    default = Some(4096))
}
